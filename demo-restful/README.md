# Spring boot

## Basic concepts / skills
- 1. Spring context -> store Beans
    - who create Bean? Before server start, "Spring Manager" manager bean cycle. 
    - Bean Cycle : @SpringBootApplication -> @ComponentScan, i.e. Find any class contain @Controller, @Service, @Configuration, @Repository
    - "Spring Manager" Create object for the above classes, put them into Spring Context(beans)

- 2. Get Beans from Context (Resolve Dependencies between beans)
    - @Autowired on Class Attribute(Field Injection)
      - "Spring Manager" resolve this dependency by finding an appropriate object fit into attribute type
    - @Autowired on Constructor ( Constructor Injection)

- 3. Flow
    - Controller Bean always @Autowired Service Bean 
    - Service Bean always @Autowired Repository bean 
    - if "Spring manager" cannot find any dependency, server start will fail

- 4. RESTful API( GET/POST/DELETE/PUT/PATCH)
    - GET: Without, create, update or delete on resource
    - POST: Create resource ONLY
    - DELETE: DELETE resource ONLY ( by id, or other resource attribute)
    - PUT: Make sure target resource already exists(Find by id). Then replace the resource by the new resource directly.
    - PATCH: Make sure target resource already exists (Find by id). Then replace the target object attribute,
    but not replace the object

## Spring Boot Project development 
- Create project by VSCode. Add dependencies for your scenario.
- After project creation, restart the VSCode. 
- Check pom.xml and application.yml
- if you need add/remove dependency, restart VSCode

- Create controller folder
  - Inside the folder, create intergace (XXXOPeration.java)
  - create impl folder, create implementation class for the interface. 
- Create service folder
  - Inside the folder, create intergace (XXXOService.java)
  - create impl folder, create implementation class for the interface. 
  
-When Controller @Autowired Sercice, remember to use service integerface, but not implementation class
- test "mvn clean install"
  
  ## Week 10 / 11
  Spring Boot:
  - RESTful API (controller)
  - Database (repository + Entity)
  - FUnctions (Service)
  - Functions (Service)
  - Additional Beans(Configuration)
  - Invoke external API (RestTemplate)
  - Data Transfer Object (DTO) x Mapper
  - Read Custom Variable from yml (@Value )
  - GlobalExceptionHandler
  - ApiResp.class(enum SysCode, BusinessException.calss)