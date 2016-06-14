# product-catalog

Because who doesn't like a product?

# Building with Concourse  
vagrant init concourse/lite  
vagrant up  
  
fly -t lite login -c http://192.168.100.4:8080  
  
create a file in the root of this repo called cf-env.yml that contains:  
GIT_REPO: https://github.com/colrich/product-catalog.git  
GIT_REPO_BRANCH: scs  
CF_API: https://api.run.pez.pivotal.io  
CF_USER: {your user}  
CF_PASS: {your pass}  
CF_ORG: pivot-colrich  
CF_SPACE: JFRJCO  
JRC_EUREKA: JRC-Eureka  
  
fly -t lite set-pipeline -p product-catalog -c pipeline.yml --load-vars-from cf-env.yml  
  
then visit http://192.168.100.4:8080/pipelines/product-catalog and unpause  
  
the builds will start shortly. they will deploy when complete to the CF instance you specify.  
  
