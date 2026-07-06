# Study Notes: Find Country by Code

Key Mechanics:
- JpaRepository natively implements primary key searches using findById(ID id).
- findById returns an Optional container object to prevent NullPointerExceptions.
- isPresent checks if a valid database record was caught matching the search target string.
- get pulls the actual entity out of the matching container block.
