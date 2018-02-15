import random

class Card:
    def __init__(self, value, suit):
        self.value = value
        self.suit = suit
    def __str__(self):
        if 1 < self.value <= 10:
            return str(self.value) + " of " + self.suit
        else:
            if self.value == 1:
                return "Ace of " + self.suit
            if self.value == 11:
                return "Jack of " + self.suit
            if self.value == 12:
                return "Queen of "+ self.suit
            if self.value == 13:
                return "King of " + self.suit
    def __eq__(self, other):
        if self.value == other.value and self.suit == other.suit:
            return True
        else:
            return False
    def get_value(self):
        if 1 < self.value <= 10:
            return self.value
        else:
            if self.value > 10:
                return 10
            if self.value == 1:
                return 11

class Deck:
    suits = ['Hearts', 'Diamonds', 'Spades', 'Clubs']
    def __init__(self):
        self.cards = []
        for i in self.suits:
            for j in range(1,14):
                self.cards.append(Card(j,i))
    def __str__(self):
        result = ""
        for card in self.cards:
            result += card.__str__() + '\n'
        return result
    def shuffle(self):
        random.shuffle(self.cards)
    def deal(self, player, num_of_cards):
        for i in range(0,num_of_cards):
            player.give(self.cards.pop())
        
class Player:
    def __init__(self):
        self.hand = []
    def give(self, card):
        self.hand.append(card)
    def __str__(self):
        result = ""
        for i in self.hand:
            result += i.__str__() + "     "
        return result
    def get_value(self):
        result = 0
        for card in self.hand:
            result += card.get_value()
        return result

