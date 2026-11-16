"""Regenerate/check static Gherkin examples using digit-place tables.

This test-data oracle is independent of the production converter's greedy algorithm.
Generated with OpenAI Codex assistance; GitHub Copilot was not used.
"""
from pathlib import Path
import argparse

ROOT = Path(__file__).resolve().parents[1]
TARGET = ROOT / "src/test/resources/features/roman_numerals.feature"
SEEDS = {1: "I", 2: "II", 3: "III", 4: "IV", 5: "V", 9: "IX", 10: "X"}
ONES = ("", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX")
TENS = ("", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC")
HUNDREDS = ("", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM")


def expected_roman(number):
    return "M" * (number // 1000) + HUNDREDS[number // 100 % 10] + TENS[number // 10 % 10] + ONES[number % 10]


def build_feature():
    lines = [
        "Feature: Roman numeral conversion",
        "  Convert positive integers to their standard Roman numeral representation.",
        "",
    ]
    for tag, title, numbers in [
        ("@seed", "Convert the introductory examples", SEEDS),
        ("@expanded", "Convert every remaining integer through 1000", [n for n in range(1, 1001) if n not in SEEDS]),
    ]:
        lines.extend([
            "  " + tag,
            "  Scenario Outline: " + title,
            "    Given a Roman numeral converter",
            "    When I convert <number>",
            '    Then the Roman numeral should be "<roman>"',
            "",
            "    Examples:",
            "      | number | roman |",
        ])
        for number in numbers:
            expected = SEEDS[number] if number in SEEDS else expected_roman(number)
            lines.append(f"      | {number} | {expected} |")
        lines.append("")
    return "\n".join(lines)


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--check", action="store_true", help="Verify the committed feature without changing it")
    args = parser.parse_args()
    content = build_feature()
    if args.check:
        if TARGET.read_text(encoding="utf-8") != content:
            raise SystemExit("Roman numeral examples are stale; regenerate them.")
        print("Verified 1000 Roman numeral examples (7 seed + 993 expanded).")
    else:
        TARGET.write_text(content, encoding="utf-8", newline="\n")
        print("Generated 1000 Roman numeral examples.")


if __name__ == "__main__":
    main()
