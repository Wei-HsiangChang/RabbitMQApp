# RabbitMQApp

Features: implements the Advance Message Queuing Protocol (AMQP)

Producer publishes message to Exchange binding each Queue with routing key, then deliver the Message to the consumer

## AMQP standards designed with main characteristics:
1. Security
2. Reliability 
3. Interoperability

## Install RabbitMQ in Mac
brew install rabbitmq

Run from background:
brew services start rabbitmq

To access rabbitMQ, open the browser and access

http://localhost:15672

The default credentials:

Username: guest

Password: guest

## App building process:
1. Config Queue and TopicExchange to bind with routing key
2  Set Message converter from String to Object
3. Create AmqpTemplate to publish the message to queue and consume it
4. Create two DTO: one to be published to the queue, another return back to the end user
5. Create publisher implementing as REST controller to accept object request published to the Queue
6. Create a Consumer to listen to the designated queue name receiving the message
