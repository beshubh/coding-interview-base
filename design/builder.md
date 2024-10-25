# LLD Question: Design a Workflow Builder for Automation

### **Overview**

Imagine you are designing a **workflow automation platform**, similar to popular marketing automation tools. The goal of this platform is to help users automate repetitive processes by creating customizable workflows. These workflows allow users to trigger actions (such as sending messages or making API calls) in a pre-defined sequence, with the option to incorporate branching logic and delays.

Such a system can be useful across various domains:

- **Marketing**: Automate customer outreach via SMS or social media.
- **Customer Support**: Trigger follow-ups or notifications based on ticket statuses.
- **Operations**: Schedule internal reminders or make HTTP calls to external systems.

The design should also support **flexibility** to allow future integrations with more apps and actions.

---

### **Core Requirements**

**Key Features**:

1. **Workflow Creation**:
    - Users should be able to create workflows with multiple types of actions (e.g., messaging, API calls).
    - Support **branching logic** based on conditions (if message contains X send DM otherwise like Message on IG).
    - Provide **status tracking** for each instance of the workflow (e.g., "In Progress", "Completed", "Failed").
2. **Supported Actions**:
    - **Send Messages** on apps like Instagram, WhatsApp, or via SMS.
    - **Add Delays** between actions (e.g., wait 24 hours before sending the next message).
    - **Make HTTP API Calls** to external systems (e.g., trigger a webhook).
3. **Optional Enhancement**:
    - How would you design **Undo/Redo functionality** for workflows? (while creating or editing a flow user want to revert an action that they added)

---

### **Guide for the Interviewee**

1. **Focus on Data Modeling**:
    - Design a **data model** that can represent workflows with various actions, branching logic, and delays. Think about relationships between entities such as workflows, actions, conditions, and instances.
2. **Modularity & Extensibility**:
    - You don't need to implement the actual messaging or API call logic. However, structure your design so that new actions (e.g., Slack message or email) can be **added easily** in the future without major refactoring.
---

### **Considerations for Discussion**
- What would the **state machine** or lifecycle of a workflow instance look like?
- How would you **persist** the workflow data? (SQL vs NoSQL? Why?)
- If a user creates a complex workflow with 1000+ actions, how will the system handle **performance and memory management**?
