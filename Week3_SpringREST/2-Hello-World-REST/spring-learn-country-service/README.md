# Study Notes: REST serialization mechanics

Serialization Pipeline:
- Controller method returns a raw Java object (Country) instead of a plain String.
- Spring Boot uses an under-the-hood library named Jackson (HttpMessageConverter) to automatically transform Java object fields into JSON format properties.
- The HTTP response Header changes its Content-Type value to application/json automatically based on this serialization.
