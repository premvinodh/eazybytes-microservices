<!-- 
	https://docs.github.com/en/github/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax#hiding-content-with-comments 
	https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet#tables
-->
# eazybytes-microservices

Contains the following projects (copied from eazybytes github)
- accounts microservice
- loans microservice
- cards microservice

Commits and their associated topics 
-----------------------------------
Refer the section below on how to [get a specific commit(https://github.com/premvinodh/eazybytes-microservices#how-to-get-certain-commit-from-github-project)].

| Sl.No		| Topic                                       																						    | Commit Hash           								|
|:---------:|---------------------------------------------------------------------------------------------------------------------------------------|:-----------------------------------------------------:|
| 	1.		| Section 2: Accounts - create api     																									| b72bb3ca012138ee4437ca011192b700a2e2214a				|
| 	2.		| Section 2: Accounts - read api     																									| d6883bcae1f8244044f6dd2bd6ff87120a0c7cb6				|
| 	3.		| Section 2: Accounts - update api     																									| 49177e9ca27599c2f68f92aeb16a9c8579ff5ced				|
| 	4.		| Section 2: Accounts - delete api     																									| 18a7e88800e3ab1069d44daa102c8b706b9fac1d				|
| 	5.		| Section 2: Accounts - added global exception handler to handle all Exceptions  														| c95b38333b069219d81eea0b9396535badf4f2e3				|
| 	6.		| Section 2: Accounts - Performing input validations on all account microservice api endpoints  										| 79f3c7297d50788b8216104927beebcaecb111db				|
| 	7.		| Section 2: Accounts - Updating audit columns using spring data jpa  																	| 079851af35ca558a934df56c617fbdedbf14f57f				|
| 	8.		| Section 2: Accounts - Added openapi dependency - springdoc-openapi-starter-webmvc-ui													| 2973accd30ca0af237eba7ef5262349466a6120d				|
| 	9.		| Section 2: Accounts - Annotations to be used with non-standard packaging for controllers, etc.										| 3ba75ffdb7ade581a76e4699989d51c93778d877				|
| 	10.		| Section 2: Accounts - @Tag, @Operation, @ApiResponses	for post operation																| 96cc0ad42857c915ab9c4b41b329b1aa86e73c5a				|
| 	11.		| Section 2: Accounts - @Operation @ApiResponses for get, put and delete operations														| 8aedd5e8e2edf8601134642efd575baa78db0b87				|
| 	12.		| Section 2: Accounts - @OpenAPIDefinition																								| 58b482cb945fc370eddfbc861c42cd9355240afe				|
| 	13.		| Section 2: Accounts - @Schema both at class level and also at the field level and @Schema in @ApiResponse of status code 500			| 5d238b85a7c3f83a45335ba7084d1814072b603a				|
| 	14.		| Section 2: Loans - Complete code of Loans microservice																				| 4ec8f08d3126f4d7fbe7602cb2f32e96fbe3f3dd				|
| 	15.		| Section 2: Accounts, Loans, Cards - the postman collection of rest apis for accounts, loans and cards microservices					| 36f30c8555ed2660632c7cbd098675a3d8c2f6e9				|
| 	16.		| Section 2: Cards - Complete code of Cards microservice																				| ccba1c9e7d0359c9b1de296055e99024e4d25436				|
| 	17.		| Section 4: Accounts - Dockerfile																										| 7d8aa59f7216ec17d14e8029d0189a092e6f5257				|
| 	18.		| Section 4: Loans - BuildPacks																											| 28b1ce31dc004c4b532b219eaddf5a5dbd0fd0af				|
| 	19.		| Section 4: Cards - Google JIB																											| e487e96e928cb284f2f7859309bec0f7b5124aa8				|
| 	20.		| Section 4: Accounts - added docker-compose.yml																						| d509f4035836fa2d6c2f1b7b6e7dd68c0bacbc13				|
| 	21.		| Section 6: Accounts - @Value annotation																								| 9915cd9ed1d8091b4abbfcd5da89ce8ea80dfd47				|
| 	22.		| Section 6: Accounts - Environment interface																							| 93a6746b4d8c4ee79d261b0c2914bcf72ef7ecf6				|
| 	23.		| Section 6: Accounts - @ConfigurationProperties annotation																				| 4913b2b429df7fa70bcf1ea03a5c2fcc04d77504				|
| 	24.		| Section 6: Accounts - Profiles																										| cf86a9b1bb91ec034517ab84ab7ba6f3908d558e				|
| 	25.		| Section 6: Loans - @Value annotation, Environment interface, @ConfigurationProperties annotation, Profiles							| b28eb8cafd375db8812f766d9ef586bb00547b37				|
| 	26.		| Section 6: Cards - @Value annotation, Environment interface, @ConfigurationProperties annotation, Profiles							| 8bb3c9e13fd5e93e5a36fbc4ed3742abb8a46b2f				|
| 	27.		| Section 6: ConfigServer - initial code																								| cfaab6a3d0793623fc308a5586c45862ca68731b				|
| 	28.		| Section 6: ConfigServer - Reading configurations from classpath location of configserver												| 89b8617c61d9cb1a90ac8ecfa16dee29645db051				|
| 	29.		| Section 6: Config Client - Reading configurations from configserver in our accounts, loans and cards microservices					| 21460f9dd0d732d04c23e99e640679f832ac650b				|
| 	30.		| Section 6: ConfigServer - Reading configurations from a filesystem																	| 60ed08351fc288ae56db40007511032ac518136a				|
| 	31.		| Section 6: ConfigServer - Reading configurations from a GitHub repository																| ca6067b5f7d238fd851f32535bdf97cd9a26d83e				|
| 	32.		| Section 6: ConfigServer - Encryption & Decryption of properties inside Config server													| d167e84cdae9be5e07c45310e83ce9c53af1c32a				|
| 	33.		| Section 6: Accounts, Loans, Cards - Refresh configurations at runtime using refresh actuator path										| fb4190f060de1f0502644b398bbff5fe187f8f36				|
| 	34.		| Section 6: Accounts, Loans, Cards, ConfigServer - Refresh configurations at runtime using busrefresh actuator path					| 332f5f6259b0f541b0d2b38d5cbd32b80876511d				|
| 	35.		| Section 6: Accounts, Loans, Cards, ConfigServer - Refresh config at runtime using Spring Cloud Bus & Spring Cloud Config monitor		| b41196724cf2eaf6dcad4ae26cbb9882ade5bb47				|
| 	36.		| Section 6: Updating Docker Compose file to adapt Config Server changes & Optimizing docker-compose.yml								| e93b9ab5af2ec168aa19433735562f6682f6a1e7				|
| 	37.		| Section 6: Updating Docker Compose file to adapt Config Server changes & Optimizing docker-compose.yml for prod and qa environments	| 94e7a4d5f6f306a446878cfc2e5436b722886754				|
| 	38.		| Section 7: MySQL DB containers for microservices - initial code																		| 25bb4780cce8aa8a01d40705b9c44f16860c8634				|
| 	39.		| Section 7: Updated microservices code to replace H2 DB with MySQL DB																	| 0746ccff9cbae9937949531ba7420c3cde8db3f1				|
| 	40.		| Section 7: Updated Docker compose file in default folder to create & use MySQL DB in microservices									| b5dab435c58592ee3effb8e6b183675d2f1206f4				|
| 	41.		| Section 7: Updated Docker compose file in qa and prod folders to create & use MySQL DB in microservices								| 2be7bc7bed069ad79cef7e1585ad00c75c0c6ad0				|
| 	42.		| Section 8: Service Discovery & Registration - initial code																			| 5b9760d80231aee9a22bf80874114b59d9e8218e				|
| 	43.		| Section 8: Service Discovery & Registration - eureka server																			| 7ea7f203ce9c7884b8ea8c761bb5dfa26b0a9052				|
| 	44.		| Section 8: Service Discovery & Registration - accounts, loans, cards microservices as eureka clients									| bc8a4034534316519ddd70b6b1647f0edfe0e822				|

### How to get certain commit from GitHub project
------------------------------------------------
1. First, clone the repository using git as shown below
git clone https://github.com/premvinodh/eazybytes-microservices.git
That downloads the complete history of the repository, so you can switch to any version. Next, change into the newly cloned repository:

2. cd <complete_path_on_your_system>\eazybytes-microservices

3. Use git checkout <COMMIT> to change to the right commit of a particular topic
git checkout 675a66cca83cdab6bfa4d713c6445674854b9238























-----

# Master Microservices with Spring Boot, Docker, Kubernetes - By Madan Reddy (fron eazybytes)

[![Image](https://github.com/eazybytes/microservices/blob/3.2.0/Microservice.png "Master Microservices with Java, Spring, Docker, Kubernetes")](https://www.udemy.com/course/master-microservices-with-spring-docker-kubernetes/?referralCode=9365DB9B7EE637F629A9)

Learn how to create enterprise and production ready Microservices with Spring, Spring Cloud, Docker and Kubernetes.

## Topics covered in the course
* Section 1 - Introduction to Microservices Architecture										Done
* Section 2- Building microservices using Spring Boot											Done
* Section 3 - How do we right size our microservices & identify boundaries						Set-03g (Misc)
* Section 4 - Handle deployment, portability &  scalability of microservices using Docker		Done
* Section 5 - Deep Dive on Cloud Native Apps & 15-Factor methodology							Set-03f (Misc)
* Section 6 - Configurations Management in Microservices										Set-02e (Microservices)
* Section 7 - Using MySQL DBs inside microservices												Set-03a (Misc)
* Section 8 - Service Discovery & Service Registration in microservices							Set-02a (Microservices)
* Section 9 - Gateway, Routing & Cross cutting concerns in Microservices						Set-02c (Microservices)
* Section 10 - Making Microservices Resilient													Set-02d (Microservices)
* Section 11 - Observability and monitoring of microservices									Set-03b (Misc)
* Section 12 - Microservices Security															Set-03c (Misc)
* Section 13 - Event Driven microservices using RabbitMQ,Spring Cloud Functions & Stream		Set-03d (Misc)
* Section 14 - Event Driven microservices using Kafka,Spring Cloud Functions & Stream			Set-03e (Misc)
* Section 15 - Container Orchestration using Kubernetes											Set-01a (K8s)
* Section 16 - Deep dive on Helm																Set-01b (K8s)
* Section 17 - Server-side service discovery and load balancing using Kubernetes				Set-02b (Microservices)
* Section 18 - Deploying microservices into cloud K8s cluster									Set-01c (K8s)
* Section 19 - Introduction to K8s Ingress, Service Mesh (Istio) & mTLS							Set-01d (K8s)
* Section 20 - Congratulations & Thank You														Done

## Pre-requisite for the course
- Good understanding on Java and Spring concepts
- Basic understanding on SpringBoot & REST services is a bonus but not mandatory
- Interest to learn and explore about Microservices

# Important Links
- Spring Boot - https://spring.io/projects/spring-boot
- Create SpringBoot project - https://start.spring.io
- DTO pattern blog - https://martinfowler.com/eaaCatalog/dataTransferObject.html
- Model Mapper - http://modelmapper.org/
- Map Struct - https://mapstruct.org/
- Spring Doc - https://springdoc.org/
- Open API - https://www.openapis.org/
- Lucidchart Blog - https://www.lucidchart.com/blog/ddd-event-storming
- Docker website - https://www.docker.com
- Docker hub website - https://hub.docker.com
- Buildpacks website - https://buildpacks.io
- Google Jib website - https://github.com/GoogleContainerTools/jib
- Docker compose website - https://docs.docker.com/compose/
- Twelve-Factor methodology - https://12factor.net
- Beyond the Twelve-Factor App book - https://www.oreilly.com/library/view/beyond-the-twelve-factor/9781492042631/
- Spring Cloud website - https://spring.io/projects/spring-cloud
- Spring Cloud Config website - https://spring.io/projects/spring-cloud-config
- Spring Cloud Bus website - https://spring.io/projects/spring-cloud-bus
- RabbitMQ website - https://www.rabbitmq.com
- Hookdeck website- https://hookdeck.com
- Spring Cloud Netflix website - https://spring.io/projects/spring-cloud-netflix
- Spring Cloud OpenFeign - https://spring.io/projects/spring-cloud-openfeign
- Netflix Blog - https://netflixtechblog.com/netflix-oss-and-spring-boot-coming-full-circle-4855947713a0
- Resilience4j website - https://resilience4j.readme.io
- Spring Cloud Gateway website - https://spring.io/projects/spring-cloud-gateway
- Stripe RateLimitter pattern blog - https://stripe.com/blog/rate-limiters
- Apache Benchmark website - https://httpd.apache.org
- Grafana website - https://grafana.com
- Grafana Loki setup - https://grafana.com/docs/loki/latest/get-started/quick-start/
- Micrometer website - https://micrometer.io
- Prometheus website - https://prometheus.io/
- Grafana Dashboards - https://grafana.com/grafana/dashboards/
- OpenTelemetry website - https://opentelemetry.io/
- OpenTelemetry automatic instrumentation - https://opentelemetry.io/docs/instrumentation/java/automatic/
- Keycloak website - https://www.keycloak.org/
- Apache Kafka website - https://kafka.apache.org
- Docker compose file for Kafka - https://github.com/bitnami/containers/blob/main/bitnami/kafka/docker-compose.yml
- Local Kubernetes Cluster with Docker Desktop - https://docs.docker.com/desktop/kubernetes/
- Kubernetes Dashboard - https://kubernetes.io/docs/tasks/access-application-cluster/web-ui-dashboard/
- Helm website - https://helm.sh
- Chocolatey website - https://chocolatey.org/
- Bitnami Helm charts GitHub repo - https://github.com/bitnami/charts
- Spring Cloud Kubernetes website - https://spring.io/projects/spring-cloud-kubernetes
- Spring Cloud Kubernetes Blog - https://spring.io/blog/2021/10/26/new-features-for-spring-cloud-kubernetes-in-spring-cloud-2021-0-0-m3
- GCP website - https://cloud.google.com
- GCP SDK installation - https://cloud.google.com/sdk/docs/install
- Kubernetes Ingress - https://kubernetes.io/docs/concepts/services-networking/ingress/
- Ingress Controllers - https://kubernetes.io/docs/concepts/services-networking/ingress-controllers/
- Istio (Service mesh) - https://istio.io


## Maven Commands used in the course

|     Maven Command       |     Description          |
| ------------- | ------------- |
| "mvn clean install -Dmaven.test.skip=true" | To generate a jar inside target folder |
| "mvn spring-boot:run" | To start a springboot maven project |
| "mvn spring-boot:build-image" | To generate a docker image using Buildpacks. No need of Dockerfile |
| "mvn compile jib:dockerBuild" | To generate a docker image using Google Jib. No need of Dockerfile |

## Docker Commands used in the course

|     Docker Command       |     Description          |
| ------------- | ------------- |
| "docker build . -t eazybytes/accounts:s4" | To generate a docker image based on a Dockerfile |
| "docker run  -p 8080:8080 eazybytes/accounts:s4" | To start a docker container based on a given image |
| "docker images" | To list all the docker images present in the Docker server |
| "docker image inspect image-id" | To display detailed image information for a given image id |
| "docker image rm image-id" | To remove one or more images for a given image ids |
| "docker image push docker.io/eazybytes/accounts:s4" | To push an image or a repository to a registry |
| "docker image pull docker.io/eazybytes/accounts:s4" | To pull an image or a repository from a registry |
| "docker ps" | To show all running containers |
| "docker ps -a" | To show all containers including running and stopped |
| "docker container start container-id" | To start one or more stopped containers |
| "docker container pause container-id" | To pause all processes within one or more containers |
| "docker container unpause container-id" | To unpause all processes within one or more containers |
| "docker container stop container-id" | To stop one or more running containers |
| "docker container kill container-id" | To kill one or more running containers instantly |
| "docker container restart container-id" | To restart one or more containers |
| "docker container inspect container-id" | To inspect all the details for a given container id |
| "docker container logs container-id" | To fetch the logs of a given container id |
| "docker container logs -f container-id" | To follow log output of a given container id |
| "docker container rm container-id" | To remove one or more containers based on container ids |
| "docker container prune" | To remove all stopped containers |
| "docker compose up" | To create and start containers based on given docker compose file |
| "docker compose down" | To stop and remove containers |
| "docker compose start" | To start containers based on given docker compose file |
| "docker compose down" | To stop the running containers |
| "docker run -p 3306:3306 --name accountsdb -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=accountsdb -d mysql" | To create a MySQL DB container |
| "docker run -p 6379:6379 --name eazyredis -d redis" | To create a Redis Container |
| "docker run -p 8080:8080 -e KEYCLOAK_ADMIN=admin -e KEYCLOAK_ADMIN_PASSWORD=admin quay.io/keycloak/keycloak:22.0.3 start-dev" | To create Keycloak Container|


## Apache Benchmark command used in the course

|     Apache Benchmark command      |     Description          |
| ------------- | ------------- |
| "ab -n 10 -c 2 -v 3 http://localhost:8072/eazybank/cards/api/contact-info" | To perform load testing on API by sending 10 requests |

## Kubernetes Commands used in the course

|     Kubernetes Command       |     Description          |
| ------------- | ------------- |
| "kubectl apply -f filename" | To create a deployment/service/configmap based on a given YAML file |
| "kubectl get all" | To get all the components inside your cluster |
| "kubectl get pods" | To get all the pods details inside your cluster |
| "kubectl get pod pod-id" | To get the details of a given pod id |
| "kubectl describe pod pod-id" | To get more details of a given pod id |
| "kubectl delete pod pod-id" | To delete a given pod from cluster |
| "kubectl get services" | To get all the services details inside your cluster |
| "kubectl get service service-id" | To get the details of a given service id |
| "kubectl describe service service-id" | To get more details of a given service id |
| "kubectl get nodes" | To get all the node details inside your cluster |
| "kubectl get node node-id" | To get the details of a given node |
| "kubectl get replicasets" | To get all the replica sets details inside your cluster |
| "kubectl get replicaset replicaset-id" | To get the details of a given replicaset |
| "kubectl get deployments" | To get all the deployments details inside your cluster |
| "kubectl get deployment deployment-id" | To get the details of a given deployment |
| "kubectl get configmaps" | To get all the configmap details inside your cluster |
| "kubectl get configmap configmap-id" | To get the details of a given configmap |
| "kubectl get events --sort-by=.metadata.creationTimestamp" | To get all the events occured inside your cluster |
| "kubectl scale deployment accounts-deployment --replicas=1" | To set the number of replicas for a deployment inside your cluster |
| "kubectl set image deployment gatewayserver-deployment gatewayserver=eazybytes/gatewayserver:s11 --record" | To set a new image for a deployment inside your cluster |
| "kubectl rollout history deployment gatewayserver-deployment" | To know the rollout history for a deployment inside your cluster |
| "kubectl rollout undo deployment gatewayserver-deployment --to-revision=1" | To rollback to a given revision for a deployment inside your cluster |
| "kubectl get pvc" | To list the pvcs inside your cluster |
| "kubectl delete pvc data-happy-panda-mariadb-0" | To delete a pvc inside your cluster |

## Helm Commands used in the course

|     Helm Command       |     Description          |
| ------------- | ------------- |
| "helm create [NAME]" | Create a default chart with the given name |
| "helm dependencies build" | To recompile the given helm chart |
| "helm install [NAME] [CHART]" | Install the given helm chart into K8s cluster |
| "helm upgrade [NAME] [CHART]" | Upgrades a specified release to a new version of a chart |
| "helm history [NAME]" | Display historical revisions for a given release |
| "helm rollback [NAME] [REVISION]" | Roll back a release to a previous revision |
| "helm uninstall [NAME]" | Uninstall all of the resources associated with a given release |
| "helm template [NAME] [CHART]" | Render chart templates locally along with the values |
| "helm list" | Lists all of the helm releases inside a K8s cluster |
