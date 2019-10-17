Post: http://localhost:8080/api/reward/payment

Request: 
{
"paymentType": "Credit Card",
"amount": 150,
"userId": 1,
"orderId":1
}

Response:-
{
    "id": 4,
    "paymentType": "Credit Card",
    "amount": 150,
    "date": "2019-10-15",
    "rewardPoints": 150,
    "userId": 1,
    "orderId": 1
}

Get: 

http://localhost:8080/api/reward/rewards?userId=1

Response:-

{
    "userId": 1,
    "rewards": {
        "Oct": 234,
        "Nov": 235,
        "Sep": 285
    },
    "totalRewards": 754
}



