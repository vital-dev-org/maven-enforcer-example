A project using maven-enforce-plugin to show a number checks that can be done
- Making sure we are running build required Java and Maven version
- Ban certain imports e.g. java.util.Vector
- Fail build if duplicate classes present (via the dependencies)
- Fail build if it has any snapshot dependencies