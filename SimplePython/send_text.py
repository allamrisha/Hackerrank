
from twilio.rest import Client

# Your Account SID from twilio.com/console
account_sid = "ACb1c9ef4188c02b5fbce57b2883ecc02a"
# Your Auth Token from twilio.com/console
auth_token  = "11eb29a9d7df47282c3208e393e6ed00"

client = Client(account_sid, auth_token)

message = client.messages.create(
    to="+3129375543", 
    from_="+15005550006",
    body="Hello from Rashmitha")

print(message.sid)

