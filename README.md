# ISEP Lab 4 - TDD, BDD and GenAI in Testing

[![Java tests](https://github.com/petitlang/isep-lab4-tdd-bdd/actions/workflows/tests.yml/badge.svg)](https://github.com/petitlang/isep-lab4-tdd-bdd/actions/workflows/tests.yml)

Three Java exercises for the Test & Test Automation lab of 16 November 2026.
Each exercise was developed through real Red / Green / Blue cycles, with a commit
and push after each recorded stage. See [the execution journal](docs/tdd-cycles.md).

| Exercise | API | Exhaustive lab test range |
| --- | --- | --- |
| Prime numbers | `new PrimeChecker().isPrime(number)` | 0..100: 101 JUnit cases |
| FizzBuzz | `new FizzBuzz().convert(number)` | 1..100: 100 JUnit cases |
| Roman numerals | `new RomanNumerals().convert(number)` | 1..1000: 1000 Cucumber scenarios |

Inputs are assumed to satisfy the lab contract: nonnegative integers for the
prime checker, positive integers for FizzBuzz, and integers 1..1000 for Roman
numerals. No input-validation API is part of the assignment. The prime checker
correctly treats 0 and 1 as non-prime.

## Run the project

Install JDK 17 or newer. Maven 3.9.9 is downloaded automatically by the Apache
Maven Wrapper on the first run; an internet connection is needed initially.

Windows PowerShell:

```powershell
Set-Location D:\ISEP-Lab4-TDD-BDD
.\mvnw.cmd clean verify
```

Linux/macOS:

```bash
./mvnw clean verify
```

Expected final result: **1201 tests/scenarios, 0 failures, 0 errors**.
The `verify` phase also enforces 100% line and branch coverage of the production
classes. Reports are generated locally and are excluded from version control:

- Cucumber HTML: `target/cucumber-report.html`
- Cucumber JSON: `target/cucumber-report.json`
- JUnit XML/text: `target/surefire-reports/`
- JaCoCo HTML: `target/site/jacoco/index.html`

To run one exercise:

```powershell
.\mvnw.cmd '-Dtest=PrimeCheckerTest' test
.\mvnw.cmd '-Dtest=FizzBuzzTest' test
.\mvnw.cmd '-Dtest=RunCucumberTest' test
```

Open this folder or import `pom.xml` as a Maven project in IntelliJ IDEA,
Eclipse or VS Code. The project has no interactive UI; its entry points are
the Java APIs and automated tests.

## BDD scenarios and test data

The Roman numeral feature keeps the seven introductory examples
`1, 2, 3, 4, 5, 9, 10` under `@seed`, and 993 additional examples under `@expanded`.
Cucumber connects the feature to the Java converter through the step definitions.

```gherkin
Given a Roman numeral converter
When I convert 49
Then the Roman numeral should be "XLIX"
```

The committed expected Roman values are generated with digit-place lookup tables,
independently of the production converter's greedy symbol algorithm. The generator
uses only Python's standard library; Python is optional when simply running the
Java tests. To check or regenerate the fixture:

```powershell
python tools/generate_roman_examples.py --check
python tools/generate_roman_examples.py
```

Prime expectations use an explicit list of primes, and FizzBuzz expectations are
stored as fixed CSV data. Tests never call production code to calculate their own
expected results.

## Development history and classroom requirements

- **Red:** run a newly failing test before implementing the behavior.
- **Green:** implement enough behavior to pass all current tests.
- **Blue:** refactor while keeping tests green; the first prime cycle explicitly
  records that no refactor was needed, as permitted by the course example.

Earlier RED commits intentionally contain failing tests. The final `main` commit
must be green. `git log --oneline --reverse` shows the ordered stages. CI was added
after the teaching cycles and checks the final result on JDK 17 and 21.

OpenAI Codex assisted the implementation and the expanded test fixtures. This
repository does **not** claim GitHub Copilot usage or contributions by a second
student. The course specifically asks for student rotation during the prime
exercise and Copilot-assisted Roman scenario expansion. Actual participants must
complete those classroom process requirements themselves if required for credit.
The course PDF is not redistributed in this public repository.
