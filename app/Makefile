.DEFAULT_GOAL := default
.PHONY: build

default: build run-dist

run-dist: build
	@./build/install/app/bin/app

install:
	@./gradlew installDist --warning-mode none

test:
	@./gradlew test --warning-mode none

build:
	@./gradlew clean build installDist --warning-mode none

clean:
	@./gradlew clean --warning-mode none

lint:
	@./gradlew checkstyleMain --warning-mode none
