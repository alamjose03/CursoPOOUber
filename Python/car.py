from account import Account
from lib2to3.pgen2 import driver
class Car:
    id        = int 
    license   = str 
    driver    = Account("", "")
    passenger = int

    def __init__(self, license, driver):
        self.license = license
        self.driver = driver 
        self.__passenger = None

    # Get y Set
    def getPassenger(self):
        return self.__passenger
    
    def setPassenger(self, passenger):
        if passenger == 4:
            self.__passenger = passenger
        else:
            print("Necesitas asignar 4 pasajeros")
