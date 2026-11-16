# Executed TDD cycles

Each row records a real Maven test run, followed by a separate commit and push.
RED commits intentionally fail; GREEN and BLUE commits pass the complete test suite.
Counts include all exercises present at that stage. No commits are backdated and no
second student or GitHub Copilot contribution is claimed. OpenAI Codex assisted this work.

| Phase | Commit subject | Executed tests | Failing/error tests | Notes |
| --- | --- | ---: | ---: | --- |
| RED | prime - 0 is not prime | 1 | 1 | The unimplemented checker fails the first test. |
| GREEN | prime - handle the first non-prime case | 1 | 0 | The minimal implementation returns false. |
| BLUE | prime - review the first implementation | 1 | 0 | No refactoring is needed, as permitted by slide 19. |
| RED | prime - distinguish 2 from 0 and 1 | 3 | 1 | The test for 1 is already green; 2 creates the next red. |
| GREEN | prime - recognize 2 | 3 | 0 | All three existing cases pass. |
| BLUE | prime - parameterize the repeated non-prime assertions | 3 | 0 | Refactor tests without changing behavior. |
| RED | prime - cover every integer from 0 through 100 | 101 | 24 | Expected values use an explicit list of the 25 primes, independent of the checker. |
| GREEN | prime - implement trial division | 101 | 0 | All 101 cases pass with the general implementation. |
| BLUE | prime - stop trial division at the square root | 101 | 0 | Preserve all results and avoid multiplication overflow. |
| RED | fizzbuzz - represent ordinary numbers as strings | 103 | 2 | The new converter is unimplemented. |
| GREEN | fizzbuzz - return the input string | 103 | 0 | The two ordinary inputs now pass. |
