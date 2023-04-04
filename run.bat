cd C:\Users\Harish\eclipse-workspace\PageObjectModel
mvn clean install

Install the Email Extension Plugin: In the Jenkins Dashboard, go to Manage Jenkins -> Manage Plugins -> Available and search for the "Email Extension Plugin". Install and restart Jenkins.

Configure the Email Extension Plugin: In the Jenkins Dashboard, go to Manage Jenkins -> Configure System. Scroll down to the "Extended E-mail Notification" section and configure the settings according to your email provider. For example, if you are using Gmail, you will need to enter the following information:

SMTP server: smtp.gmail.com
Use SSL: checked
SMTP Port: 465
Default user e-mail suffix: @gmail.com
User Name: your Gmail email address
Password: your Gmail password
Click on "Test configuration by sending test e-mail" to verify that the email settings are correct.
Configure Email Notification in Job: In the Jenkins Dashboard, open the project that you want to configure email notification for. Go to Configure -> Post-build Actions -> Editable Email Notification. Fill in the required fields, including the recipient email addresses, subject, and message body. You can also attach build artifacts and customize the email notification further.

Save the configuration: Once you have filled in the required fields, click on "Advanced Settings" to customize the email notification further. Finally, click on "Save" to save the configuration.

That's it! Now Jenkins will send email notifications whenever a build is completed.