# IntelliJ

## Q: How does the scope of "Project SDK" settings in IntelliJ affect your workflow when managing multiple projects, and why is this isolation important?

**A:** The isolation of SDK scopes per project is important once each project can be developed in different versions, so when using Intellij's ide, you can hit "play" to run a given .java file and it would use the project's Java version to compile and run it. If we would set the SDK project agnostic we could face problems such as compilation errors as `cannot find symbol` duo to a given symbol not being present in the given Java version.

---
