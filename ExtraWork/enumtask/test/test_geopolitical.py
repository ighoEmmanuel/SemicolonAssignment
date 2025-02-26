import unittest
from enum import Enum
from ExtraWork.enumtask.geopolitical import GeoPolitical


class TestGeoPolitical(unittest.TestCase):
    def test_north_central(self):
        self.assertEqual(GeoPolitical.get_political_zone("Benue"), "North Central")
        self.assertEqual(GeoPolitical.get_political_zone("Plateau"), "North Central")

    def test_north_east(self):
        self.assertEqual(GeoPolitical.get_political_zone("Borno"), "North East")
        self.assertEqual(GeoPolitical.get_political_zone("Yobe"), "North East")

    def test_north_west(self):
        self.assertEqual(GeoPolitical.get_political_zone("Kano"), "North West")
        self.assertEqual(GeoPolitical.get_political_zone("Zamfara"), "North West")

    def test_south_east(self):
        self.assertEqual(GeoPolitical.get_political_zone("Enugu"), "South East")
        self.assertEqual(GeoPolitical.get_political_zone("Imo"), "South East")

    def test_south_south(self):
        self.assertEqual(GeoPolitical.get_political_zone("Rivers"), "South South")
        self.assertEqual(GeoPolitical.get_political_zone("Edo"), "South South")

    def test_south_west(self):
        self.assertEqual(GeoPolitical.get_political_zone("Lagos"), "South West")
        self.assertEqual(GeoPolitical.get_political_zone("Ogun"), "South West")

    def test_case_insensitivity(self):
        self.assertEqual(GeoPolitical.get_political_zone("lAgOs"), "South West")
        self.assertEqual(GeoPolitical.get_political_zone("pLaTeAu"), "North Central")

    def test_invalid_state(self):
        self.assertIsNone(GeoPolitical.get_political_zone("UnknownState"))
        self.assertIsNone(GeoPolitical.get_political_zone(""))
        self.assertIsNone(GeoPolitical.get_political_zone("123"))