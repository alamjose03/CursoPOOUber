from payment import Payment

class Paypal(Payment):
    id = int
    email = str 
    # Constructor
    def __init__(self, id, email):
        super().__init__(id)
        self.email = email