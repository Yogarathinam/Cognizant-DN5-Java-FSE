# Week 4 Study Notes: Independent Microservices Deployment

### Architectural Insights & Concepts (L2 SME Checklist)
1. **Port Allocation Principles:**
   - Decoupled microservices natively default to port `8080`. Running multiple microservices simultaneously on a single operating platform engine triggers a `java.net.BindException: Address already in use`.
   - Modifying the properties architecture using the `server.port` specification allows dynamic horizontal system placement.

2. **Console Management View:**
   - When running continuous microservice apps in an integrated IDE (IntelliJ or Eclipse), individual stream terminals run simultaneously. Use the monitor/console selection option view to evaluate live status information.
