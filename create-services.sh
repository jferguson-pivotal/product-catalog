#!/bin/bash
cf login -a $CF_API -u $CF_USER -p $CF_PASS -o $CF_ORG -s $CF_SPACE --skip-ssl-validation
cf api $CF_API --skip-ssl-validation
cf cs p-service-registry standard $JRC_EUREKA
