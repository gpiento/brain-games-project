default: installDist
	@./build/install/app/bin/app

run-dist: installDist
	@./build/install/app/bin/app

installDist:
	@./gradlew installDist --warning-mode none

clean:
	@./gradlew clean

checkstyle:
	@./gradlew checkstyle
