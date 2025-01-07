class Tv:
    def __init__(self):
        self.channel = 0
        self.on = False
        self.volume = 0
        self.volume_holder = 0

    def turn_on(self):
        self.on = True

    def turn_off(self):
        self.on = False

    def is_on(self):
        return self.on

    def is_off(self):
        return not self.on

    def move_channel(self):
        if not self.on:
            raise TypeError("TV is off. Turn it on first!")
        if self.channel >= 20:
            print("Channel cannot go up further")
        else:
            self.channel += 1

    def get_channel(self):
        return self.channel

    def reverse_channel(self):
        if not self.on:
            raise Exception("TV is off. Turn it on first!")
        if self.channel > 0:
            self.channel -= 1
        else:
            print("Channel cannot go down further")

    def increase_volume(self):
        if not self.on:
            raise Exception("TV is off. Turn it on first!")
        if self.volume < 100:
            self.volume += 1

    def get_volume(self):
        return self.volume

    def decrease_volume(self):
        if not self.on:
            raise TypeError("TV is off. Turn it on first!")
        if self.volume > 0:
            self.volume -= 1
        else:
            print("Volume is already at the lowest level")

    def mute(self):
        if not self.on:
            raise TypeError("TV is off. Turn it on first!")
        self.volume_holder = self.volume
        self.volume = 0

    def unmute(self):
        if not self.on:
            raise TypeError("TV is off. Turn it on first!")
        self.volume = self.volume_holder
