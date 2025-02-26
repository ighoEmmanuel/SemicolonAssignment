def pascal_triangle(number):
    holder = [[1]]
    for counter in range(1, number):
        row = [1]
        for count in range(1, counter):
            row.append(holder[counter - 1][count - 1] + holder[counter - 1][count])
        row.append(1)
        holder.append(row)

    return holder





print(pascal_triangle(2))
