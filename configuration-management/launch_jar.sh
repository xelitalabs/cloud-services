#!/usr/bin/env bash
cd target && java -Dspring.profiles.active=DEV,native -jar *.jar
