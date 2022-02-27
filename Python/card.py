from payment import Payment

class Card(Payment):
    id = int
    number = int
    cvv = int
    date = str 

    def __init__(self, id, number):
        super().__init__(id)
        self.number = number