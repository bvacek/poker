from poker import Deck, Card, Player
print()
print()
print()
print()
print()
print()
print()
print()
print()
print()
print()
print("                  Welcome to BlackJack!")
print()
print("                           $")
print("                         $$$$$")
print("                       $$  $  $$")
print("                      $    $    $")
print("                      $    $    ")
print("                       $$  $  ")
print("                         $$$$$")
print("                           $  $$")
print("                           $    $")
print("                      $    $    $")
print("                       $$  $  $$")
print("                         $$$$$")
print("                           $")
print()

playing = True

while playing:
    myDeck = Deck()
    myDeck.shuffle()
    dealer = Player()
    player = Player()
    myDeck.deal(dealer, 2)
    myDeck.deal(player, 2)
    print("Here are the dealer's cards: " + dealer.__str__())
    dealer_sum = dealer.get_value()
    print("They add to " + str(dealer_sum))
    print()
    print("Here are your cards: " + player.__str__())
    player_sum = player.get_value()
    print("They add to " + str(player_sum))
    print()
    hitting = True
    while hitting:
        answer = input("Hit or Stay?")
        if answer.lower() == "hit":
            myDeck.deal(player, 1)
            print("Here are your cards: " + player.__str__())
            player_sum = player.get_value()
            if player_sum > 21:
                print("BUST!")
                print()
                hitting = False
            else:
                print("They add to " + str(player_sum))
                print()
        else:
            hitting = False
    while dealer_sum < 17 and player_sum <= 21:
        print()
        print("The dealer hits.")
        myDeck.deal(dealer,1)
        print("Here are the dealer's cards: " + dealer.__str__())
        dealer_sum = dealer.get_value()
        print("They add to " + str(dealer_sum))
        print()
    if dealer_sum > 21:
        print("The dealer busts!")
        print()
    elif player_sum <= 21:
        print("The dealer stays.")
        print()
    if 21 >= player_sum > dealer_sum or dealer_sum > 21:
        print("You won!")
        print()
    elif player_sum == dealer_sum:
        print("You tied with the dealer.")
        print()
    else:
        print("You lost. :(")
        print()
    if str(input("Would you like to play again (Yes or No)?")).lower() != "yes":
        playing = False
    print()
    print()
