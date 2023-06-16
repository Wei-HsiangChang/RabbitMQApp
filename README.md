# RabbitMQApp

Features: implements the Advance Message Queuing Protocol (AMQP)

<b>Producer</b> publishes message to <b>Exchange</b> binding each <b>Queue</b> with routing key, then deliver the Message to the <b>Consumer</b>

## AMQP standards designed with main characteristics:
1. Security
2. Reliability 
3. Interoperability

## Install RabbitMQ in Mac
```brew install rabbitmq```

Run from background:<br>
```brew services start rabbitmq```

To access RabbitMQ:<br>

http://localhost:15672

The default credentials:<br>

Username: guest

Password: guest

## App building process:
Process:
1. Configure Queue and TopicExchange to bind with routing key
2. Set Message converter from String to Object
3. Create AmqpTemplate to publish the message to queue and consume it
4. Create DTOs to carry data and set message format
5. Create publisher implementing as REST controller to accept object request published to the Queue
6. Create a Consumer to listen to the designated queue name receiving the message
