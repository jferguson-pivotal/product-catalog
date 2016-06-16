# Product-Catalog

Because who doesn't like a product?

# Building with Concourse  

**Each sub-directory here ** has a yml file that defines the Concourse Pipeline.

**Start the Concourse app like this** 

1. vagrant init concourse/lite  
2. vagrant up  
3. Access http://192.168.100.4:8080 and click on the fly cli to download locally
4. On mac place it under bin 

**Target the Concourse endpoint on cli using Fly** 
```javascript
5. fly -t lite login -c http://192.168.100.4:8080  
```
6. Create a file on your local env which defines these. See sample git-creds.yml here that contains git ssh keys / PCF api credentials
        git-repo: {repo url}  
        cf-user: {your user}  
        cf-pass: {your pass}  
        cf-org: {your org}  
        cf-space: {your space}  

**Set the pipeline in Concourse**
```javascript
7.fly -t lite set-pipeline -p product-catalog -c pipeline.yml --load-vars-from git-creds.yml
```
This sets the alias name "lite" to be reused in subsequent fly commands with the -t option. 
  
8. Visit local endpoint http://192.168.100.4:8080/pipelines/product-catalog  to confirm the Pipeline is installed 
  
9. Concourse Builds will start shortly. The build will follow the task / steps defined in the pipeline and as each stap passes will continue on. At the end it should deploy your artifacts to the Pivotal Cloud Foundry using the credentials given in cf-env.yml

**Summary Arch Diagram**

![alt text](https://github.com/jferguson-pivotal/product-catalog/blob/master/Product-Microservice.png "Summary Arch Diagram..in progress")

