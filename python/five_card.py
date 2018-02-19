from poker import Player, Card, Deck

playing = True

while playing:
    my_deck = Deck()
    my_deck.shuffle()
    opponent = Player()
    player = Player()
    my_deck.deal(opponent, 5)
    my_deck.deal(player, 5)
    print(opponent)
    print(player)
    playing = False
