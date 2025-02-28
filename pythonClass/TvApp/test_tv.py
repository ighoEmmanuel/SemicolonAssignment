import unittest
import tv

class TestTvFunctions(unittest.TestCase):

    def setUp(self):
        self.tv = tv.Tv()

    def test_that_my_tv_is_on_when_created(self):
        self.tv.turn_on()
        self.assertTrue(self.tv.is_on())

    def test_that_my_tv_can_turn_off_if_i_turn_it_on(self):
        self.tv.turn_on()
        self.tv.turn_off()
        self.assertFalse(self.tv.is_on())

    def test_that_my_tv_can_move_channel(self):
        self.tv.turn_on()
        self.tv.move_channel()
        self.assertEqual(1, self.tv.get_channel())

    def test_that_my_tv_can_reverse_channel(self):
        self.tv.turn_on()
        self.tv.move_channel()
        self.tv.reverse_channel()
        self.tv.move_channel()
        self.tv.move_channel()
        self.tv.reverse_channel()
        self.assertEqual(1, self.tv.get_channel())

    def test_that_my_tv_increase_volume(self):
        self.tv.turn_on()
        self.tv.increase_volume()
        self.assertEqual(1, self.tv.get_volume())

    def test_that_my_tv_decrease_volume(self):
        self.tv.turn_on()
        self.tv.increase_volume()
        self.tv.increase_volume()
        self.tv.decrease_volume()
        self.assertEqual(1, self.tv.get_volume())

    def test_that_my_tv_move_channel_return_error_if_not_on(self):
        self.tv.turn_on()
        self.assertRaises(TypeError, self.tv.move_channel())

    def test_that_my_tv_mute_function(self):
        self.tv.turn_on()
        self.tv.increase_volume()
        self.tv.increase_volume()
        self.tv.increase_volume()
        self.tv.mute()
        self.assertEqual(0, self.tv.get_volume())

    def test_that_my_tv_unmute_function(self):
        self.tv.turn_on()
        self.tv.increase_volume()
        self.tv.increase_volume()
        self.tv.increase_volume()
        self.tv.mute()
        self.tv.unmute()
        self.assertEqual(3, self.tv.get_volume())


