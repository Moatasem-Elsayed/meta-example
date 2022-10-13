from tkinter import *

window = Tk()
window.geometry("200x50+150+200")
Label(window, text="Led Red", fg="red", bg="black").grid(row=0, column=0)
Label(window, text="Led yellow", fg="yellow", bg="black").grid(row=1, column=1)
Label(window, text="Led Green", fg="green", bg="white").grid(row=3, column=3)
window.mainloop()
