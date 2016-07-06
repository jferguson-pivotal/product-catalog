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

mvn -f ProductUIRepo1/product-ui/pom.xml clean package
cp ProductUIRepo1/product-ui/target/product-ui-0.0.1-SNAPSHOT.jar jar-file/
