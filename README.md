# product-catalog

Because who doesn't like a product?

# Building with Concourse
vagrant init concourse/lite
vagrant up

fly -t lite login -c http://192.168.100.4:8080

create a file in the root of this repo called cf-env.yml that contains:
git-repo: <repo url>
cf-user: <your user>
cf-pass: <your pass>
cf-org: <your org>
cf-space: <your space>

fly -t lite set-pipeline -p product-catalog -c pipeline.yml --load-vars-from cf-env.yml

then visit http://192.168.100.4:8080/pipelines/product-catalog

the builds will start shortly. they will deploy when complete to the CF instance you specify.

