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
