# Product-Catalog

Because who doesn't like a product?

# Building with Concourse  

**Each sub-directory here ** has a yml file that defines the Concourse Pipeline.

Start the Concourse app like this 

1. vagrant init concourse/lite  
2. vagrant up  

3. Access http://192.168.100.4:8080 and click on the fly cli to download locally
4. On mac place it under bin 

Target the Concourse endpoint on cli using Fly 

5. fly -t lite login -c http://192.168.100.4:8080  

6. create a file in the root of this repo called cf-env.yml that contains git ssh keys / PCF api credentials 
        git-repo: {repo url}  
        cf-user: {your user}  
        cf-pass: {your pass}  
        cf-org: {your org}  
        cf-space: {your space}  

Set the pipeline in Concourse 

7.fly -t lite set-pipeline -p product-catalog -c pipeline.yml --load-vars-from cf-env.yml  
  
8. visit http://192.168.100.4:8080/pipelines/product-catalog  to confirm the Pipeline is installed 
  
9. Concourse Builds will start shortly. The build will follow the task / steps defined in the pipeline and as each stap passes will continue on. At the end it should deploy your artifacts to the Pivotal Cloud Foundry using the credentials given in cf-env.yml
  
