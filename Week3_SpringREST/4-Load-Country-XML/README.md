# Study Notes: XML Country Bean Metadata Parsing

Core Metadata Concepts:
- property tag uses setter injection under the hood to set properties on fields after the object is constructed.
- name attribute corresponds to the setter method name structure following java bean conventions.
- value attribute contains the literal value being injected into the mapped setter parameter block.

Context Mechanics:
- ClassPathXmlApplicationContext reads metadata straight out of target paths to populate bean specifications.
- context.getBean searches the container infrastructure and returns a typed singleton instance.
