#!/bin/sh

set -e # fail fast
set -x # print commands

# git clone <source> <target>
#
# cd <target>
# ls -la
# echo $(date) > bumpme
#
#
# git add .
# git commit -m "Bumped date"
# ls -la
# pwd
# cd ../
ls -la

mvn -f PhotoServiceRepo1/photo-service/pom.xml clean package
cp PhotoServiceRepo1/photo-service/target/photo-service-0.0.1-SNAPSHOT.jar jar-file/
