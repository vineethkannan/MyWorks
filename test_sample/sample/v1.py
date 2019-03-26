'''
Created on Jan 14, 2019

@author: USER NEW
'''
import random
import unittest
import HtmlTestRunner

class TestSequenceFunctions(unittest.TestCase):

    def setUp(self):
        self.seq = range(10)

    def test_shuffle(self):
        # make sure the shuffled sequence does not lose any elements
        random.shuffle(self.seq)
        self.seq.sort()
        self.assertEqual(self.seq, range(10))

        # should raise an exception for an immutable sequence
        self.assertRaises(TypeError, random.shuffle, (1,2,3))
    @unittest.skip("Test Skipped1")
    def test_choicep(self):
        element = random.choice(self.seq)
        self.assertTrue(element in self.seq)
    @unittest.skip("Test Skipped2")
    def test_samplep(self):
        with self.assertRaises(ValueError):
            random.sample(self.seq, 20)
        for element in random.sample(self.seq, 5):
            self.assertTrue(element in self.seq)

suite = unittest.TestLoader().loadTestsFromTestCase(TestSequenceFunctions)
unittest.TextTestRunner(verbosity=2).run(suite)

outfile = open("/Documents/", "w")
runner = HtmlTestRunner.HTMLTestRunner(
stream=outfile,title='Test Report',description='This demonstrates the report output by Prasanna.Yelsangikar.')

runner.run(suite)