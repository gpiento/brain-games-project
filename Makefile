.DEFAULT_GOAL := default
.PHONY: build

default: build run-dist

run-dist: build
	@./app/build/install/app/bin/app

install:
	make -C app install

test:
	make -C app test

build:
	make -C app build

clean:
	make -C app clean

lint:
	make -C app lint
