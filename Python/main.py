# Importar el elemento Car
# del archivo llamado car importame la clase Car que este ahi
from uberVan import UberVan
from driver import Driver
from uberX import UberX
from uberPool import UberPool
from car import Car
from account import Account
from user import User

if __name__ == "__main__":
    print("Hola mundo")

    car = Car("AJS37", Account("Andres Herrera", "AN90459"))
    print(vars(car))

    uberX = UberX("JKS089", Account("Fernando Sanchez", "FESA83"), "Dodge", "Attitude")
    print(vars(uberX))

    user = User("Alam Pérez", "AJ00");
    print(vars(user))

    driver = Driver("Maria Cih", "MC00");
    print(vars(driver))

    uberPool = UberPool("AH01", Account("Andres Herrera", "AHJ39"), "Dodge", "Attitude")
    uberPool.setPassenger(4)
    print(vars(uberPool))

    uberVan = UberVan("HJS92", Account("Alam Pérez", "AP0730"), "Mazda", "CX-30")
    uberVan.setPassenger(6)
    print(vars(uberVan))




