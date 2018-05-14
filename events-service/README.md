# Events

How to start the Events application
---
1. cd events-service
2. Run `mvn clean install` to build your application
3. Start application with `java -jar target/events-0.0.1-SNAPSHOT.jar server config.yml`
4. To check that your application is running enter url `http://localhost:9090/api/events`

Health Check
---

To see your applications health enter url `http://localhost:9091/healthcheck`


