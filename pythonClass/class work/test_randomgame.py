from unittest import TestCase
import randomgame



class TestRandomGame(TestCase):
	def test_that_random_game_exist(self):
		randomgame.get_random(1, 1000)