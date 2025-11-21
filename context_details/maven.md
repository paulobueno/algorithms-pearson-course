# Maven

## Q: Why does Maven "win" over manual IntelliJ settings when a `pom.xml` is present?

**A:** Maven "win" over manual IntelliJ settings when a `pom.xml` is presente due to Intellij's architecture decision, once all project's definition should be the source of truth over any IDE configuration.

---

## Q: What is the difference between Maven's "local repository" and a "remote repository"?

**A:** The difference between Maven's "local repository", that is usually stored in `~/.me/repository` direcory and a "remote repository" is that Maven first of all tries to check if the specified module (in the pom.xlm) is locally installed and if not then search on remote repositories. The current problem was that, first of all Maven tried to search for the given version locally, which wasnt installed, then searched remotly, which also didnt find anything. Doe to it, it fails to compile. Instaling locally with the right version number solved the problem once Maven could find it when compiling the project

---
