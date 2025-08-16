Customers can log a complaint against any unsuccessful transaction.
Customer Service Agents can search for customer issues with issue ID or customer details (email).
Agents can view their assigned issues and mark them resolved once they are resolved.
System should assign the issue to agents based on an assigning strategy.
System should allow the admin to onboard new agents.
System should allow the admin to view the agent's work history.

Interaction/Runner layer  - API/CommandLine/Unit Tests - A layer through which your client/user or whoever is sort of using it, is interacting with it.
    - IntModel - Request Response Model - DTOs
Transformer - IntModel -> BusModel, BusModel -> IntModel
Business Layer - Core part of the system which is implementing the business functionality.
    - BusModel
Transformer - BusModel -> DBModel, DBModel -> BusModel
Persistence Layer - DB, Redis, In memory
    - DBModel - DAOs



- You give ticket id and ask to assign that ticket to a agent.
- You create ticket and keep open tickets in some queue, and then agent asks for assignment, and you pick one ticket and give to the agent.
- There is no physical agents, auto resolutions.



/api/v1/admin