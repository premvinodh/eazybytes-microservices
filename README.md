<!-- 
	https://docs.github.com/en/github/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax#hiding-content-with-comments 
	https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet#tables
-->
# eazybytes-microservices

Contains the following projects
- accounts microservice.

Commits and their associated topics 
-----------------------------------
Refer the section below on how to [get a specific commit(https://github.com/premvinodh/eazybytes-microservices#how-to-get-certain-commit-from-github-project)].

| Sl.No		| Topic                                       																						| Commit Hash           								|
|:---------:|-----------------------------------------------------------------------------------------------------------------------------------|:-----------------------------------------------------:|
| 	1.		| Section 2: Accounts - create api     																								| b72bb3ca012138ee4437ca011192b700a2e2214a				|
| 	2.		| Section 2: Accounts - read api     																								| d6883bcae1f8244044f6dd2bd6ff87120a0c7cb6				|
| 	3.		| Section 2: Accounts - update api     																								| 49177e9ca27599c2f68f92aeb16a9c8579ff5ced				|
| 	4.		| Section 2: Accounts - delete api     																								| 18a7e88800e3ab1069d44daa102c8b706b9fac1d				|
| 	5.		| Section 2: Accounts - added global exception handler to handle all Exceptions  													| c95b38333b069219d81eea0b9396535badf4f2e3				|
| 	6.		| Section 2: Accounts - Performing input validations on all account microservice api endpoints  									| 79f3c7297d50788b8216104927beebcaecb111db				|
| 	7.		| Section 2: Accounts - Updating audit columns using spring data jpa  																| 079851af35ca558a934df56c617fbdedbf14f57f				|
| 	8.		| Section 2: Accounts - Added openapi dependency - springdoc-openapi-starter-webmvc-ui												| 2973accd30ca0af237eba7ef5262349466a6120d				|
| 	9.		| Section 2: Accounts - Annotations to be used with non-standard packaging for controllers, etc.									| 3ba75ffdb7ade581a76e4699989d51c93778d877				|
| 	10.		| Section 2: Accounts - @Tag, @Operation, @ApiResponses	for post operation															| 96cc0ad42857c915ab9c4b41b329b1aa86e73c5a				|
| 	11.		| Section 2: Accounts - @Operation @ApiResponses for get, put and delete operations													| 8aedd5e8e2edf8601134642efd575baa78db0b87				|
| 	12.		| Section 2: Accounts - @OpenAPIDefinition																							| 58b482cb945fc370eddfbc861c42cd9355240afe				|
| 	13.		| Section 2: Accounts - @Schema both at class level and also at the field level and @Schema in @ApiResponse of status code 500		| 5d238b85a7c3f83a45335ba7084d1814072b603a				|
| 	14.		| Section 2: Loans - Complete code of Loans microservice																			| 4ec8f08d3126f4d7fbe7602cb2f32e96fbe3f3dd				|
| 	15.		| Section 2: Accounts, Loans, Cards - the postman collection of rest apis for accounts, loans and cards microservices				| 36f30c8555ed2660632c7cbd098675a3d8c2f6e9				|
| 	16.		| Section 2: Cards - Complete code of Cards microservice																			| ccba1c9e7d0359c9b1de296055e99024e4d25436				|

### How to get certain commit from GitHub project
------------------------------------------------
1. First, clone the repository using git as shown below
git clone https://github.com/premvinodh/eazybytes-microservices.git
That downloads the complete history of the repository, so you can switch to any version. Next, change into the newly cloned repository:

2. cd <complete_path_on_your_system>\eazybytes-microservices

3. Use git checkout <COMMIT> to change to the right commit of a particular topic
git checkout 675a66cca83cdab6bfa4d713c6445674854b9238
