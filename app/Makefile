default: run-dist

run-dist:
	@./build/install/app/bin/app

installDist:
	@./gradlew installDist --warning-mode none

test:
	@./gradlew clean
	@./gradlew test

build:
	@./gradlew clean build
	@./gradlew installDist --warning-mode none

clean:
	@./gradlew clean

checkstyle:
	@./gradlew checkstyleMain

.PHONY: build
