# Goods Management API

This project focuses on the development of a simple API for the management of a goods in a company.
The back-end of the application is developed using Java 8 and the Spring framework, while the front-end is developed in ReactJS. The database used is H2.

- **Back-end:** https://github.com/LauraTDauden/goods-management
- **Front-end:** https://github.com/LauraTDauden/goods-management-front

## Business case
    • This company is focused in buying and selling products. 
    • This is the information needed for each item:
        ◦ Item code: Must be a unique value. This should be a numeric value.
        ◦ Description
        ◦ Price
        ◦ State : This can either be ‘Active’ or ‘Discontinued’.
        ◦ Suppliers. Each item can be supplied by a set of suppliers. Likewise, a supplier can provide more than one item.
        ◦ Price reductions. An item can have several price reductions associated to it. No control for overlapping dates is required but recommended (look at the section ‘Extra points’).
        ◦ Creation date
        ◦ Creator (User)
    • This is the information needed for each supplier:
        ◦ Name
        ◦ Country 
    • This is the information needed for the price reduction:
        ◦ Reduced price
        ◦ Start date
        ◦ End date

## Class diagram
![Untitled Diagram drawio](https://user-images.githubusercontent.com/84546617/161215249-3ae670d4-dd51-43bc-898b-f6dd3754c60c.png)

In addition to the class diagram shown, the entity of DeactivationReason was also added to deal with the deactivation process of items. 
This class is composed of an id (long), a deactivation reason (String), the item that has been deactivated (Item) and the user that has made such deactivation (User).

## Tasks
    1. Login: The API should have an access window where the user can sign in with its corresponding username and password. This should be implemented using an authentication mechanism.
    2. List of items: The API should represent the list of items offered by the company. An option to filter the records by the item’s state should be implemented.
       This list should include the following information:
        ◦ Item code: 
        ◦ Description
        ◦ State 
        ◦ Price 
        ◦ Creation date
        ◦ Creator 
    3. Item’s information: The detailed information of an item selected from the list should be represented in a window. The suppliers and price reductions associated to the item must be included too.  
    4. Create an item: An action to create an item must be developed. 
        ◦ The only mandatory fields are the ‘Item code’ and ‘Description’. 
        ◦ The value ‘Active’ should be set as the default state. 
        ◦ The current date should be set as the creation date.
    5. Edit an item’s data: ‘Active’ items should be modifiable. 
        ◦ All the fields (excluding the item code) should be editable.
        ◦ An option to associate a supplier should be included. The system should verify that the supplier is  not associated to the item already. 
        ◦ An option to insert price reductions should be implemented.
    6. Deactivate an item: Implement an option to deactivate an item by changing its state to ‘Discontinued’. 
        ◦ The user has to specify the reason for the deactivation.
        ◦ The user performing the deactivation has to be registered.
        
## Additional tasks
    1. Admin: Implement a role for Adminstrators, so they can:
        1. Manage user information
            ▪ Create users
            ▪ Delete users
            ▪ List users
        2. Delete items.
    2. Control of overlapping dates when inserting a price reduction. An item cannot have two active price reductions at the same time.
    3. SQLs: Build the corresponding SQL queries to obtain the following results
        1. List of cheapest item per supplier.
        2. List of suppliers associated to items whose price has been reduced.
    4. Documentation: Include the following software documentation:
        1. Class diagram
        2. User manual

