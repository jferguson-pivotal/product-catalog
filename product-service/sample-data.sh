
curl --user user:$1 -i -X POST -H "Content-Type:application/json" -d '{  "name" : "The Dan Mearls Bike", "shortName" : "dan-bike", "description" : "A lovely vintage bike in Pivotal racing green", "cost" : "10000.01", "quantityInStock" : "1" }' http://localhost:8080/products

curl --user user:$1 -i -X POST -H "Content-Type:application/json" -d '{  "name" : "The Cold Brew Coffee Tap", "shortName" : "coffee-tap", "description" : "The font from which all wisdom flows", "cost" : "9203.04", "quantityInStock" : "2" }' http://localhost:8080/products

curl --user user:$1 -i -X POST -H "Content-Type:application/json" -d '{  "name" : "The Gong", "shortName" : "gong", "description" : "GONGGGGG", "cost" : "0.50", "quantityInStock" : "1" }' http://localhost:8080/products

curl --user user:$1 -i -X POST -H "Content-Type:application/json" -d '{  "name" : "The Ping-Pong Table", "shortName" : "ping-pong-table", "description" : "A place to settle arguments in a fun if potentially irrational manner.", "cost" : "999.99", "quantityInStock" : "1" }' http://localhost:8080/products
