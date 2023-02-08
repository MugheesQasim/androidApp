import re
from collections import Counter
from math import sqrt

def get_result(word1, word2):

    common_word = word1[1].intersection(word2[1])

    cos = sum((word1[0][i] * word2[0][i])
        for i in common_word) * 100
    try:
        a = (cos/word1[2])/word2[2]
    except ZeroDivisionError:
        a = 0
    
    return a

def text(word):

    count_word = Counter(word)                            

    set_word = set(count_word)

    length_word = sqrt(sum(leng*leng
        for leng in count_word.values()))

    return count_word, set_word, length_word

def cosine_similarity(word_a, word_b):
    
    a = word_a
    b = word_b
    
    vec1 = text(a)
    vec2 = text(b)

    result = get_result(vec1, vec2)
    return "accuracy: " + str(round(result, 3))

#print (cosine_similarity('گرمی','جرمنی'))

