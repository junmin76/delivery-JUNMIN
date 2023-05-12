# 
![image](https://github.com/junmin76/delivery-JUNMIN/assets/31524855/55e6aad3-3e8c-45ba-82c1-0d59ce3f6a86)

![image](https://user-images.githubusercontent.com/31524855/237037071-ae78d84d-c8c4-41b5-b5ab-88ee038291d0.png)
![image](https://user-images.githubusercontent.com/31524855/237037293-e9a840b0-0333-46d2-8b62-1d05fd39f5bd.png)

## Model
www.msaez.io/#/storming/deliveryjunmin

## Before Running Services
### Make sure there is a Kafka server running
```
cd kafka
docker-compose up
```
- Check the Kafka messages:
```
cd kafka
docker-compose exec -it kafka /bin/bash
cd /bin
./kafka-console-consumer --bootstrap-server localhost:9092 --topic
```

## Run the backend micro-services
See the README.md files inside the each microservices directory:

- Front
- Store
- Rider
- CustomerCenter


## Run API Gateway (Spring Gateway)
```
cd gateway
mvn spring-boot:run
```

## Test by API
- Front
```
 http :8088/orders id="id" 
```
- Store
```
 http :8088/cookings id="id" 
```
- Rider
```
```
- CustomerCenter
```
```


## Run the frontend
```
cd frontend
npm i
npm run serve
```

## Test by UI
Open a browser to localhost:8088

## Required Utilities

- httpie (alternative for curl / POSTMAN) and network utils
```
sudo apt-get update
sudo apt-get install net-tools
sudo apt install iputils-ping
pip install httpie
```

- kubernetes utilities (kubectl)
```
curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"
sudo install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl
```

- aws cli (aws)
```
curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"
unzip awscliv2.zip
sudo ./aws/install
```

- eksctl 
```
curl --silent --location "https://github.com/weaveworks/eksctl/releases/latest/download/eksctl_$(uname -s)_amd64.tar.gz" | tar xz -C /tmp
sudo mv /tmp/eksctl /usr/local/bin
```

