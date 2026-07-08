# Study Notes: RESTful Web Services Architecture

Key Endpoint Annotations:
- @RestController: Marks the Java class as a controller where every routing handler method automatically serializes its return value straight inside the HTTP response body payload.
- @GetMapping: Shortcut variant matching explicit HTTP GET requests targeting a configured URL sub-resource path routing destination pattern.

Network Pipeline Infrastructure:
- HTTP Response Headers deliver crucial background transport operational parameters like Content-Type (e.g., text/plain or application/json), Status Codes (e.g., 200 OK), and Content-Length.
