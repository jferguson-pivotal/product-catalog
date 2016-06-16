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

mvn -f ProductServiceRepo1/product-service/pom.xml clean package
cp ProductServiceRepo1/product-service/target/product-service-0.0.1-SNAPSHOT.jar jar-file/
