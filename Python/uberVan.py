from car import Car
class UberVan(Car):
    typeCarAccepted = []
    seatsMaterial = []

    # Constructor
    def __init__(self, license, driver, typeCarAccepted, seatsMaterial):
        super().__init__(license, driver)
        self.typeCarAccepted = typeCarAccepted
        self.seatsMaterial = seatsMaterial

    # Polimorfismo
    def setPassenger(self, passenger):
        if passenger == 6:
            self._passenger = passenger
        else:
            print("Necesitas asignar 6 pasajeros")
